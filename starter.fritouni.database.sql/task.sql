CREATE TABLE task(
	task_id serial PRIMARY KEY,
	task_name VARCHAR(50) UNIQUE NOT NULL,
	description VARCHAR(500),
	created_on DATE NOT NULL,
	is_done boolean,
	user_login VARCHAR(10)
);