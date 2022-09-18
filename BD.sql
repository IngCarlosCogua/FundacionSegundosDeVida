-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.9.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para movies_rental
CREATE DATABASE IF NOT EXISTS `movies_rental` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `movies_rental`;

-- Volcando datos para la tabla movies_rental.alquiler: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `alquiler` DISABLE KEYS */;
/*!40000 ALTER TABLE `alquiler` ENABLE KEYS */;

-- Volcando datos para la tabla movies_rental.pelicula: ~18 rows (aproximadamente)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`id`, `titulo`, `genero`, `autor`, `copias`, `novedad`) VALUES
	(1, 'The Shape of Water', 'MAgico/Cambio', 'Guillermo del Toro', 5, 0),
	(2, 'El laberinto del fauno', 'Fantasía/Bélico', 'Guillermo del Toro', 6, 1),
	(3, 'El callejón de las almas perdidas', 'Suspenso/Drama', 'Guillermo del Toro', 7, 0),
	(4, 'El orfanato', 'Terror/Suspenso', 'Juan Antonio Bayona', 2, 8),
	(5, 'El Hobbit: Un viaje inesperado', 'Aventura/Fantasía', 'Peter Jackson', 10, 1),
	(6, 'Splice: experimento mortal', 'Ciencia ficción/Terror', 'Vincenzo Natali', 6, 0),
	(7, 'Depredador: La presa', 'Acción/Ciencia ficción', 'Dan Trachtemberg', 10, 0),
	(8, 'Candyman: El Dominio de la Mente', 'Terror/Suspenso', 'Bernard Rose', 4, 0),
	(9, 'Quicksilver Highway', 'Terror/Comedía de terror', 'Mick Garris', 4, 1),
	(10, 'Cuentos de terror 2', 'Terror/Fantasía', 'Michael Gornick', 5, 0),
	(11, 'El resplandor', 'Terror', 'Stephen King', 8, 0),
	(12, 'Graveyard Shift', 'Terror', 'Ralph S./ Singleton', 6, 0),
	(13, 'Thinner', 'Terror/Guion adaptado', 'Tom Holland', 3, 0),
	(14, 'Te (Eso)', 'Terror/Suspenso', 'apdntrUBltptelo', 6, 0),
	(15, 'En la hierba alta', 'Terror/Orama', 'Ma Matali', 2, 1),
	(16, 'The Shining', 'Terror/Misterio', 'Stanley Kubrick', 3, 8),
	(17, 'Room 237', 'Documental', 'Rodney Ascher', 4, 0),
	(18, 'The Silence of the Lambs', 'Suspenso/Terror', 'Jonathan Demme', 6, 0);
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;

-- Volcando datos para la tabla movies_rental.usuario: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`username`, `contrasena`, `nombre`, `apellido`, `email`, `saldo`, `premiun`) VALUES
	('juan', '1234', 'juan', 'perez', 'juan@gmail.com', 3000.00, 1),
	('mario', '1234', 'mario', 'cardenas', 'mario@gmail.com', 300.00, 0),
	('pedro', '1234', 'pedro', 'pedro', 'pedro@gamil.com', 2.00, 0),
	('unicornio', '1111', 'uni', 'cornio', 'unicornio@gamil.com', 19.00, 0),
	('unicornio2', '1111', 'uni2', 'cornio2', 'unicornio2@gamil.com', 199.00, 0),
	('unicornio3', '1111', 'uni3', 'cornio3', 'unicornio3@gamil.com', 1990.00, 0);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
