CREATE TABLE MENUITEM
(
    menuitem_id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    name            VARCHAR(255),
    price           DECIMAL(10, 2),
    description     TEXT,
    menuitemimg     VARCHAR(2000)
);

CREATE TABLE RESTAURANT_TABLE
(
    table_id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    table_number     INT,
    seating_capacity INT,
    is_occupied      BOOLEAN,
    tableimage       VARCHAR(500)
);

CREATE TABLE ORDERS
(
    orders_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    table_id    BIGINT,
    FOREIGN KEY (table_id) REFERENCES RESTAURANT_TABLE (table_id),
    description TEXT,
    total_cost  DECIMAL(10, 2)
);

CREATE TABLE ORDER_MENUITEM
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    menuitemId BIGINT,
    FOREIGN KEY (menuitemId) REFERENCES MENUITEM (menuitem_id),
    orderId    BIGINT,
    FOREIGN KEY (orderId) REFERENCES ORDERS (orders_id),
    quantity   INT
);




