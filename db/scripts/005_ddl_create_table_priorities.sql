CREATE TABLE if not exists priorities (
   id SERIAL PRIMARY KEY,
   name TEXT UNIQUE NOT NULL,
   position int
);


ALTER TABLE item
    ADD COLUMN priority_id int
        REFERENCES priorities(id);
