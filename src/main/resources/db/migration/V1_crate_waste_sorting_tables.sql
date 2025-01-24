CREATE TABLE IF NOT EXISTS WASTE_CATEGORIES (
    ID SERIAL PRIMARY KEY NOT NULL,
    CATEGORY VARCHAR(255) NOT NULL,
    DESCRIPTION TEXT,
    DATE_CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    DATE_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE IF NOT EXISTS GUIDELINES (
    ID SERIAL PRIMARY KEY NOT NULL,
    GUIDELINE TEXT NOT NULL,
    STEP_NUMBER INTEGER,
    WASTE_CATEGORY_ID INTEGER NOT NULL,
    DATE_CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    DATE_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_GUIDELINES_CATEGORY FOREIGN KEY (WASTE_CATEGORY_ID)
    REFERENCES WASTE_CATEGORIES (ID) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS RECYCLING_TIPS (
    ID SERIAL PRIMARY KEY NOT NULL,
    TIP TEXT NOT NULL,
    SOURCE VARCHAR(255),
    WASTE_CATEGORY_ID INTEGER NOT NULL,
    DATE_CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    DATE_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_TIPS_CATEGORY FOREIGN KEY (WASTE_CATEGORY_ID)
    REFERENCES WASTE_CATEGORIES (ID) ON DELETE CASCADE
);