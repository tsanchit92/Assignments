INSERT INTO users (username, password, enabled)
  values ('user',
    'user123',
    true);
    


INSERT INTO authorities (username, authority)
  values ('user', 'ROLE_USER');
  
