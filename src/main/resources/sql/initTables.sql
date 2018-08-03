INSERT INTO role (id, name) VALUES (0, 0);
INSERT INTO role (id, name) VALUES (1, 1);
INSERT INTO role (id, name) VALUES (2, 2);
INSERT INTO role (id, name) VALUES (3, 3);
INSERT INTO role (id, name) VALUES (4, 4);

INSERT INTO account (id, email, password, role_id, credentials_non_expired, enabled, non_expired, non_locked) VALUES
  (1, "staff@ex.com", "$2a$10$7SxMo6cX8.IAv4AaHhx2T.glpnNc/S7u7ZdCIsFepYzppqNcDx14G", 1, TRUE, TRUE, TRUE, TRUE),
  (2, "resident@ex.com", "$2a$10$7SxMo6cX8.IAv4AaHhx2T.glpnNc/S7u7ZdCIsFepYzppqNcDx14G", 2, TRUE, TRUE, TRUE, TRUE),
  (3, "moder@ex.com", "$2a$10$7SxMo6cX8.IAv4AaHhx2T.glpnNc/S7u7ZdCIsFepYzppqNcDx14G", 3, TRUE, TRUE, TRUE, TRUE),
  (4, "admin@ex.com", "$2a$10$7SxMo6cX8.IAv4AaHhx2T.glpnNc/S7u7ZdCIsFepYzppqNcDx14G", 4, TRUE, TRUE, TRUE, TRUE);

INSERT INTO house (id, address) VALUES (1, "lviv");

INSERT INTO flat (id, number, account_id, house_id) VALUES (1, "1", 2, 1), (2, "2", 3, 1);