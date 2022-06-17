CREATE TABLE IF NOT EXISTS CAR
(
    id          UUID PRIMARY KEY NOT NULL,
    make        VARCHAR(255)     NOT NULL,
    model       VARCHAR(255)     NOT NULL,
    features    JSONB            NOT NULL,
    year        INT              NOT NULL,
    description VARCHAR(255)
)