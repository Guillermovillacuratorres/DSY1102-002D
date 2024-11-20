
CREATE TABLE `libro` (
  `id` int(11) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `id_categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `libro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

