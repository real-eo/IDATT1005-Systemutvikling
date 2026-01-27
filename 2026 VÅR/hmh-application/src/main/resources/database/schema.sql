-- Help Me Help (HmH) Application Database Schema
-- SQLite Database Schema for donation management system

-- Users Table
CREATE TABLE IF NOT EXISTS users (
    user_id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    phone_number TEXT,
    created_date TEXT NOT NULL
);

-- Organizations Table
CREATE TABLE IF NOT EXISTS organizations (
    organization_id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    registration_number TEXT UNIQUE,
    description TEXT,
    category TEXT,
    website_url TEXT,
    is_verified INTEGER DEFAULT 0,
    ik_status TEXT
);

-- Donations Table
CREATE TABLE IF NOT EXISTS donations (
    donation_id INTEGER PRIMARY KEY AUTOINCREMENT,
    user_id INTEGER NOT NULL,
    organization_id INTEGER NOT NULL,
    amount REAL NOT NULL,
    donation_date TEXT NOT NULL,
    notes TEXT,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (organization_id) REFERENCES organizations(organization_id) ON DELETE CASCADE
);

-- User Preferred Causes Table
CREATE TABLE IF NOT EXISTS user_preferred_causes (
    user_id INTEGER NOT NULL,
    cause TEXT NOT NULL,
    PRIMARY KEY (user_id, cause),
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

-- Create indexes for better query performance
CREATE INDEX IF NOT EXISTS idx_users_email ON users(email);
CREATE INDEX IF NOT EXISTS idx_organizations_registration ON organizations(registration_number);
CREATE INDEX IF NOT EXISTS idx_organizations_verified ON organizations(is_verified);
CREATE INDEX IF NOT EXISTS idx_donations_user ON donations(user_id);
CREATE INDEX IF NOT EXISTS idx_donations_organization ON donations(organization_id);
CREATE INDEX IF NOT EXISTS idx_donations_date ON donations(donation_date);

-- Insert sample data for testing (optional)
-- Uncomment the following lines to populate with sample data

-- Sample Users
-- INSERT INTO users (name, email, phone_number, created_date) VALUES
--     ('John Doe', 'john.doe@example.com', '+4712345678', datetime('now')),
--     ('Jane Smith', 'jane.smith@example.com', '+4787654321', datetime('now'));

-- Sample Organizations
-- INSERT INTO organizations (name, registration_number, description, category, website_url, is_verified, ik_status) VALUES
--     ('Norwegian Red Cross', '971277882', 'Humanitarian organization', 'Health', 'https://www.redcross.no', 1, 'APPROVED'),
--     ('Save the Children Norway', '959468652', 'Children\'s rights organization', 'Children', 'https://www.reddbarna.no', 1, 'APPROVED'),
--     ('WWF Norway', '952419071', 'Environmental conservation', 'Environment', 'https://www.wwf.no', 1, 'APPROVED');

-- Sample Donations
-- INSERT INTO donations (user_id, organization_id, amount, donation_date, notes) VALUES
--     (1, 1, 500.00, datetime('now'), 'Monthly donation'),
--     (1, 2, 250.00, datetime('now'), 'Support for children'),
--     (2, 3, 1000.00, datetime('now'), 'Environmental cause');

-- Sample Preferred Causes
-- INSERT INTO user_preferred_causes (user_id, cause) VALUES
--     (1, 'Health'),
--     (1, 'Children'),
--     (2, 'Environment'),
--     (2, 'Education');
