SELECT v.titulo, v.visitas
FROM videos v 
WHERE v.likes > 10000;

-- 1. mostrar id_comentario, texto,
-- id_video y titulo del video
-- para todos los comentarios

SELECT c.id_comentario, c.texto, c.id_video, v.id_video, v.titulo
FROM comentarios c, videos v
WHERE c.id_video = v.id_video;

SELECT c.id_comentario, c.texto, c.id_video, v.id_video, v.titulo
FROM comentarios c JOIN videos v ON c.id_video = v.id_video;

SELECT c.id_comentario, c.texto, c.id_video, v.id_video, v.titulo
FROM comentarios c JOIN videos v USING(id_video);

-- lista el titulo y fecha de los comentarios en febrero junto al usuario

--SELECT v.titulo c.

SELECT SUBSTR