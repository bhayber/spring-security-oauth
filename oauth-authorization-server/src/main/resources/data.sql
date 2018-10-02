INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('fooClientIdPassword', '$2a$10$7Np.nHygIW7NIPjE4TBbv.ujPC2AlihykTfgVRy6oKmnNMmpeiyWW', 'foo,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('sampleClientId', '$2a$10$7Np.nHygIW7NIPjE4TBbv.ujPC2AlihykTfgVRy6oKmnNMmpeiyWW', 'read,write,foo,bar',
	'implicit', null, null, 36000, 36000, null, false);
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('barClientIdPassword', '$2a$10$7Np.nHygIW7NIPjE4TBbv.ujPC2AlihykTfgVRy6oKmnNMmpeiyWW', 'bar,read,write',
	'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
