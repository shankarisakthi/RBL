
CREATE TABLE `stl_stall_details` (    
                     `stl_id` bigint(6) NOT NULL,        
                     `stl_place` varchar(25) NOT NULL,   
                     `stl_date` date NOT NULL,           
                      PRIMARY KEY (`stl_id`)              
                   ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
				
CREATE TABLE `ast_asset_type` (           
                  `ast_type_id` int(3) NOT NULL,          
                  `ast_asset_name` varchar(20) NOT NULL,  
                  PRIMARY KEY (`ast_type_id`)             
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `hty_hobby_type` (          
                  `hty_type_id` int(3) NOT NULL,         
                  `hty_type_name` varchar(20) NOT NULL,  
                  PRIMARY KEY (`hty_type_id`)            
                ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pct_purchase_type` (    
                     `pct_id` int(3) NOT NULL,           
                     `pct_name` varchar(20) NOT NULL,    
                     PRIMARY KEY (`pct_id`)              
                   ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
				   
CREATE TABLE `ldt_lead_details` (                                                                                    
                    `ldt_id` bigint(10) NOT NULL,                                                                                      
                    `ldt_lead_id` varchar(10) NOT NULL,                                                                                 
                    `ldt_lead_name` varchar(20) NOT NULL,                                                                              
                    `ldt_mobile_number` bigint(10) NOT NULL,                                                                           
                    `ldt_email_id` varchar(255) NOT NULL,                                                                              
                    `ldt_date_of_birth` date NOT NULL,                                                                                 
                    `ldt_gender` varchar(6) NOT NULL,                                                                                  
                    `ldt_maritial_status` tinyint(1) NOT NULL,                                                                         
                    `ldt_family_income` bigint(8) NOT NULL,                                                                            
                    `ldt_no_of_earnings` int(2) NOT NULL,                                                                              
                    `ldt_employment_type` varchar(20) NOT NULL,                                                                        
                    `ldt_savings_percentage` int(3) NOT NULL,                                                               
                    `ldt_stall_id` bigint(6) NOT NULL,                                                                                    
                    PRIMARY KEY (`ldt_id`),       
                    KEY `FK_ldt_lead_stall` (`ldt_stall_id`), 
                    CONSTRAINT `FK_ldt_lead_stall` FOREIGN KEY (`ldt_stall_id`) REFERENCES `stl_stall_details` (`stl_id`)                                                                                    
                   )ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `lht_lead_hobbies` (                                                                            
                    `lht_lead_id` bigint(6) NOT NULL,                                                                          
                    `lht_hobby_id` int(3) NOT NULL,    
                       PRIMARY KEY (`lht_lead_id`,`lht_hobby_id`),
  				  UNIQUE KEY `lpt_hobby_type_id_UNIQUE` (`lht_hobby_id`),                                                                      
                    KEY `FK_lht_lead_hobbies` (`lht_hobby_id`),                                                                
                    KEY `FK_lht_lead_id` (`lht_lead_id`),                                                                      
                    CONSTRAINT `FK_lht_lead_id` FOREIGN KEY (`lht_lead_id`) REFERENCES `ldt_lead_details` (`ldt_id`),          
                    CONSTRAINT `FK_lht_lead_hobbies` FOREIGN KEY (`lht_hobby_id`) REFERENCES `hty_hobby_type` (`hty_type_id`)  
                  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
				
				  
CREATE TABLE `lpt_lead_purchase_type` (                                                                                     
                          `lpt_lead_id` bigint(6) NOT NULL,                                                                                         
                          `lpt_purchase_type_id` int(3) NOT NULL,                                                                                   
                         PRIMARY KEY (`lpt_lead_id`,`lpt_purchase_type_id`),
  				  UNIQUE KEY `lpt_purchase_type_id_UNIQUE` (`lpt_purchase_type_id`),
				  KEY `fk_lead_pct`(`lat_lead_id`),
				  KEY `fk_purchase_type` (`lpt_purchase_type_id`),
				  CONSTRAINT `fk_purchase_type` FOREIGN KEY (`lpt_purchase_type_id`) REFERENCES `pct_purchase_type` (`pct_id`),
				  CONSTRAINT `fk_lead_pct` FOREIGN KEY (`lat_lead_id`) REFERENCES `ldt_lead_details` (`ldt_id`)  
                        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
			

CREATE TABLE `lat_lead_assets` (                                                                            
                   `lat_lead_id` bigint(10) NOT NULL,                                                                        
                   `lat_asset_id` int(3) NOT NULL,                                                                           
                  PRIMARY KEY (`lat_lead_id`,`lat_asset_id`),
  				  UNIQUE KEY `lat_asset_id_UNIQUE` (`lat_asset_id`),
				  KEY `fk_lead` (`lat_lead_id`),
				  KEY `fk_asset` (`lat_asset_id`),
				  CONSTRAINT `fk_asset` FOREIGN KEY (`lat_asset_id`) REFERENCES `ast_asset_type` (`ast_type_id`),
				  CONSTRAINT `fk_lead` FOREIGN KEY (`lat_lead_id`) REFERENCES `ldt_lead_details` (`ldt_id`)  
                 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;

CREATE TABLE `rol_role` (                    
            `role_id` int(3) NOT NULL AUTO_INCREMENT,  
            `role_name` varchar(20) NOT NULL,          
            PRIMARY KEY (`role_id`)                    
          ) ENGINE=InnoDB DEFAULT CHARSET=utf8;				 
				
CREATE TABLE `emp_employee` (                                                                                                
                `emp_id` bigint(6) NOT NULL AUTO_INCREMENT,                                                                                
                `emp_name` varchar(20) NOT NULL,                                                                                           
                `role_id` int(3) NOT NULL,                                                                                                 
                `manager_id` bigint(6) DEFAULT NULL,                                                                                       
                `emp_code` varchar(20) NOT NULL,                                                                                           
                PRIMARY KEY (`emp_id`),                                                                                                    
                KEY `FK_role_id` (`role_id`),                                                                                              
                CONSTRAINT `FK_role_id` FOREIGN KEY (`role_id`) REFERENCES `rol_role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION  
              ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
				   
CREATE TABLE `usr_user_credentials` (    
								`usr_id` bigint(6) NOT NULL AUTO_INCREMENT,                                                      
                        `usr_username` varchar(20) NOT NULL,                                                          
                        `pas_password` varchar(20) NOT NULL,                                                          
                        `usr_status` tinyint(1) NOT NULL,
								 PRIMARY KEY (`usr_id`)                                                     
                        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
					  
CREATE TABLE `so_stall_owners` (                                                                            
                  `so_stl_id` bigint(6) NOT NULL,                                                                        
                  `so_emp_id` bigint(6) NOT NULL,                                                                           
                  PRIMARY KEY (`so_stl_id`,`so_emp_id`),
  				  UNIQUE KEY `so_stl_id_UNIQUE` (`so_stl_id`),
				  KEY `fk_emp` (`so_emp_id`),
				  KEY `fk_stall` (`so_stl_id`),
				  CONSTRAINT `fk_stall` FOREIGN KEY (`so_stl_id`) REFERENCES `stl_stall_details` (`stl_id`),
				  CONSTRAINT `fk_emp` FOREIGN KEY (`so_emp_id`) REFERENCES `emp_employee` (`emp_id`) 
                 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;

ALTER TABLE `ldt_lead_details`
	ADD COLUMN `ldt_emp_id` BIGINT(6) NOT NULL AFTER `ldt_id`;
ALTER TABLE `ldt_lead_details`
	ADD CONSTRAINT `FK_ldt_lead_emp` FOREIGN KEY (`ldt_emp_id`) REFERENCES `emp_employee` (`emp_id`);
	
	ALTER TABLE `emp_employee`
	ADD COLUMN `email_id` VARCHAR(50) NOT NULL AFTER `emp_name`;