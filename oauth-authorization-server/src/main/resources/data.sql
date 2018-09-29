INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('fooClientIdPassword', '$2b$10$VOSmzWgno4RbHQwqcdljPuSE03j6LhOpGlK7GrOv2Wp08hOWLq.zy', 'foo,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('sampleClientId', '$2b$10$VOSmzWgno4RbHQwqcdljPuSE03j6LhOpGlK7GrOv2Wp08hOWLq.zy', 'read,write,foo,bar',
	'implicit', null, null, 36000, 36000, null, false);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('barClientIdPassword', '$2b$10$VOSmzWgno4RbHQwqcdljPuSE03j6LhOpGlK7GrOv2Wp08hOWLq.zy', 'bar,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
