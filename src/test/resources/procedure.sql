CREATE OR REPLACE PROCEDURE insert_user(
    phone_number varchar2,
    age number,
    email varchar2,
    action varchar2) AS
BEGIN
    INSERT INTO JOHN_WICK (PHONE_NUMBER, AGE, EMAIL, ACTION)
    VALUES (phone_number, age, email, action);
END;
/

BEGIN
    insert_user('79306661007', 29, 'neo@gmail.com', 'create');
END;