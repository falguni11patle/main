USE definitions;

DROP TABLE IF EXISTS `dashboards`;

CREATE TABLE IF NOT EXISTS `dashboards` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `createdAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `dashboards` (`createdAt`, `updatedAt`, `title`)
VALUES
  ('2025-01-01 10:00:00', '2025-01-01 10:00:00', 'Sales Performance Overview'),
  ('2025-01-02 11:15:00', '2025-01-02 11:15:00', 'Executive KPI Summary'),
  ('2025-01-03 09:30:00', '2025-01-03 09:30:00', 'Customer Support Metrics');
