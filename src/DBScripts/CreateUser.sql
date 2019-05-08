-- Choose a string password
CREATE USER webUser WITH PASSWORD = 'Password@12345';

-- Grant permissions
GRANT SELECT,INSERT,UPDATE,DELETE ON OBJECT::dbo.JobTitle TO webUser;
GRANT SELECT,INSERT,UPDATE,DELETE ON OBJECT::dbo.Employee TO webUser;
