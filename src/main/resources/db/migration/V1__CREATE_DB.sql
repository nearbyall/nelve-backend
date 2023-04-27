CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(255) UNIQUE NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password_hash VARCHAR(255) NOT NULL,
                       first_name VARCHAR(255),
                       last_name VARCHAR(255),
                       bio TEXT,
                       profile_photo_url VARCHAR(255),
                       created_at TIMESTAMP NOT NULL,
                       updated_at TIMESTAMP NOT NULL
);

CREATE TABLE skills (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE user_skills (
                             id SERIAL PRIMARY KEY,
                             user_id INTEGER NOT NULL REFERENCES users(id),
                             skill_id INTEGER NOT NULL REFERENCES skills(id),
                             proficiency_level INTEGER NOT NULL,
                             UNIQUE (user_id, skill_id)
);

CREATE TABLE groups (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) UNIQUE NOT NULL,
                        description TEXT,
                        created_at TIMESTAMP NOT NULL,
                        updated_at TIMESTAMP NOT NULL
);

CREATE TABLE user_groups (
                             id SERIAL PRIMARY KEY,
                             user_id INTEGER NOT NULL REFERENCES users(id),
                             group_id INTEGER NOT NULL REFERENCES groups(id),
                             role VARCHAR(255) NOT NULL,
                             UNIQUE (user_id, group_id)
);

CREATE TABLE resources (
                           id SERIAL PRIMARY KEY,
                           title VARCHAR(255) NOT NULL,
                           description TEXT,
                           url VARCHAR(255) NOT NULL,
                           user_id INTEGER NOT NULL REFERENCES users(id),
                           created_at TIMESTAMP NOT NULL,
                           updated_at TIMESTAMP NOT NULL
);

CREATE TABLE events (
                        id SERIAL PRIMARY KEY,
                        title VARCHAR(255) NOT NULL,
                        description TEXT,
                        start_time TIMESTAMP NOT NULL,
                        end_time TIMESTAMP NOT NULL,
                        location VARCHAR(255),
                        online BOOLEAN NOT NULL,
                        user_id INTEGER NOT NULL REFERENCES users(id),
                        created_at TIMESTAMP NOT NULL,
                        updated_at TIMESTAMP NOT NULL
);

CREATE TABLE user_events (
                             id SERIAL PRIMARY KEY,
                             user_id INTEGER NOT NULL REFERENCES users(id),
                             event_id INTEGER NOT NULL REFERENCES events(id),
                             UNIQUE (user_id, event_id)
);

CREATE TABLE messages (
                          id SERIAL PRIMARY KEY,
                          content TEXT NOT NULL,
                          sender_id INTEGER NOT NULL REFERENCES users(id),
                          receiver_id INTEGER NOT NULL REFERENCES users(id),
                          created_at TIMESTAMP NOT NULL,
                          updated_at TIMESTAMP NOT NULL
);

CREATE TABLE group_messages (
                                id SERIAL PRIMARY KEY,
                                content TEXT NOT NULL,
                                sender_id INTEGER NOT NULL REFERENCES users(id),
                                group_id INTEGER NOT NULL REFERENCES groups(id),
                                created_at TIMESTAMP NOT NULL,
                                updated_at TIMESTAMP NOT NULL
);

CREATE TABLE ratings (
                         id SERIAL PRIMARY KEY,
                         rating INTEGER NOT NULL,
                         comment TEXT,
                         user_from_id INTEGER NOT NULL REFERENCES users(id),
                         user_to_id INTEGER NOT NULL REFERENCES users(id),
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL,
                         UNIQUE (user_from_id, user_to_id)
);