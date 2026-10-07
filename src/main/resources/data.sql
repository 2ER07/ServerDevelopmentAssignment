
INSERT INTO users (name, point, created_at, updated_at) VALUES
                                                            ('홍길동', 10000, NOW(), NOW()),
                                                            ('김철수', 0, NOW(), NOW());

INSERT INTO products (name, price, category, is_on_sale, created_at, updated_at) VALUES
                                                                                     ('아메리카노', 4000, 'COFFEE', 'ON_SALE', NOW(), NOW()),
                                                                                     ('카페라떼', 4500, 'LATTE', 'ON_SALE', NOW(), NOW()),
                                                                                     ('레몬에이드', 5000, 'ADE', 'SOLD_OUT', NOW(), NOW()),
                                                                                     ('딸기스무디', 5500, 'SMOOTHIE', 'ON_SALE', NOW(), NOW()),
                                                                                     ('치즈케이크', 6000, 'DESSERT', 'DISCONTINUED', NOW(), NOW());