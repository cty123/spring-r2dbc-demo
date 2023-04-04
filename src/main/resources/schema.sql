CREATE TABLE IF NOT EXISTS products(
    product_id INTEGER PRIMARY KEY,
    description VARCHAR(255)
);

INSERT INTO products(product_id, description) VALUES (123, 'foo') ON conflict (product_id) do nothing;
INSERT INTO products(product_id, description) VALUES (456, 'bar') ON conflict (product_id) do nothing;
