INSERT IGNORE INTO categoria (imagen, nombre)
VALUES
("https://image.lexica.art/full_webp/1abd3b65-eff8-4d54-8126-17cf2836e43b", "PERRO"),
("https://image.lexica.art/full_webp/172f1484-6fb9-49cf-9a71-6c13bb760402", "GATO"),
("https://cards.algoreducation.com/_next/image?url=https%3A%2F%2Ffiles.algoreducation.com%2Fproduction-ts%2F__S3__c7523d33-44cf-4dbf-b4be-607bdc0837dd&w=3840&q=75", "RACIONES"),
("https://media.istockphoto.com/id/877490114/es/foto/accesorios-del-perro-sobre-fondo-amarillo-vista-superior-concepto-de-animales-y-mascotas.jpg?s=612x612&w=0&k=20&c=5q2oC1LVv0FWpg_jWEND4wGNbzYWWW-zgG0fu5Xoavg=", "ACCESORIOS"),
("https://image.lexica.art/full_webp/20052ae2-6e49-411a-998d-d087484a9e54", "ANIMALES"),
("https://image.lexica.art/full_webp/3b7a17ef-a4dc-4468-b0eb-58a3ece55dd4", "FARMACIA"),
("https://image.lexica.art/full_webp/b0d456d1-6ab2-46b3-8b75-cb52e5b9cf17","PLANTAS"),
("https://image.lexica.art/full_webp/11c70a98-fd27-4282-b4de-387b01959919", "MACETAS Y PRODUCTOS");

INSERT IGNORE INTO producto (categoria_id, imagen, nombre, descripcion, precio)
VALUES
("2", "https://distribuidoralopez.com.uy/wp-content/uploads/2024/06/D_602099-MLA76683488454_062024-F.jpg","Lager Premium - Gato Adulto", "Alimento Lager Premium para gato adulto Sabor Mix - 7kg", "$ 1.50"),
("2", "https://http2.mlstatic.com/D_NQ_NP_637188-MLU75047529898_032024-O.webp", "Sushi Cat - Gato Adulto", "Alimento Sushi Cat para gatos de todas las edades - 7kg", "$ 10.5"),
("2", "https://devotouy.vtexassets.com/arquivos/ids/1532882-800-auto?v=638619544599500000&width=800&height=auto&aspect=true", "Alimento PrimoGato Premium", "Alimento PrimoGato para gatos castrados - 10kg", "$ 1.5"),
("2", "https://buffettmascotas.com.uy/wp-content/uploads/2022/06/vittamax-correcto.jpg", "Vitta Max - Gato Adulto", "Alimento Vitta Max para gato adulto - 10kg", "$ 1.5"),
("2", "https://www.matsudapet.com.br/img/produtos/vittamax-13.png", "Viita Max - Gato Mix" , "Alimento Vitta Max para gatos de todas las edades - 10kg", "$ 1.5"),
("2", "https://sanjuanmascotas.uy/cdn/shop/products/vittamax-gato-pescado_500x.png?v=1605883682", "Vitta Max - Gato Peixe", "Alimento Vitta Max sabor pescado - 10kg", "$ 1.5"),
("2", "https://lasplaces.com.uy/wp-content/uploads/2021/07/CAT-CHOW-600x600.png", "Purina Cat Chow", "Alimento Purina Cat Chow para gato adulto sabor carne - 15kg", "$ 1.5"),
("1", "https://veterinarialahacienda.com/cdn/shop/products/nurtican-adultos_01_b04c3199-c389-40c9-8534-21db45b11e75_1024x1024@2x.jpg?v=1648913746", "Nutri Can - Perro Adulto", "Alimento para perro adulto - 7kg + 1kg de regalo", "$ 1.5"),
("1", "https://lasplaces.com.uy/wp-content/uploads/2021/07/lager-cachorro-corregido-600x380.png", "Lager Premium Cachorros", "Alimento para perros cachorros - 22 kg", "$ 1.5"),
("1", "https://www.racionya.uy/wp-content/uploads/2020/09/maxinecachorros.png", "Maxine Premium", "Alimento para perros cachorros - 21kg", "$ 1.5"),
("1", "https://sucanuy.vtexassets.com/arquivos/ids/186773-800-auto?v=637934433347400000&width=800&height=auto&aspect=true", "Maxine Super Premium", "Alimento para perros adultos - 21kg", "$ 1.5"),
("1", "https://http2.mlstatic.com/D_NQ_NP_931561-MLA45768207715_042021-O.webp", "Maxine Super Premium", "Alimento para perros adultos sabor mix - 25kg", "$ 1.5"),
("1","https://nuevaerauruguay.com/wp-content/uploads/2021/07/7797453000666-product-image-1.png", "Pedigree Adultos", "Alimento para perros adultos sabor carne y vegetales - 21kg", "$1.5" ),
("1", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLxLQinCxWJKdPwyNjVbOR4GRaeKdnc5uMjA&s", "Pedigree Razas Pequeñas", "Alimentos para perros adultos de razas pequeñas - 21kg","$1.5" );