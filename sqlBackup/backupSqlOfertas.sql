PGDMP     
                    z         
   it_ofertas    12.4    12.4                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            	           1262    93240 
   it_ofertas    DATABASE     ?   CREATE DATABASE it_ofertas WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Colombia.1252' LC_CTYPE = 'Spanish_Colombia.1252';
    DROP DATABASE it_ofertas;
                postgres    false                        2615    93241    oferta    SCHEMA        CREATE SCHEMA oferta;
    DROP SCHEMA oferta;
                postgres    false            ?            1259    93244    ofertas    TABLE     ?   CREATE TABLE oferta.ofertas (
    offerse_id integer NOT NULL,
    name text NOT NULL,
    description text NOT NULL,
    price_value numeric NOT NULL
);
    DROP TABLE oferta.ofertas;
       oferta         heap    postgres    false    6            ?            1259    93242    ofertas_offerse_id_seq    SEQUENCE     ?   CREATE SEQUENCE oferta.ofertas_offerse_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE oferta.ofertas_offerse_id_seq;
       oferta          postgres    false    204    6            
           0    0    ofertas_offerse_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE oferta.ofertas_offerse_id_seq OWNED BY oferta.ofertas.offerse_id;
          oferta          postgres    false    203            ?
           2604    93247    ofertas offerse_id    DEFAULT     x   ALTER TABLE ONLY oferta.ofertas ALTER COLUMN offerse_id SET DEFAULT nextval('oferta.ofertas_offerse_id_seq'::regclass);
 A   ALTER TABLE oferta.ofertas ALTER COLUMN offerse_id DROP DEFAULT;
       oferta          postgres    false    204    203    204                      0    93244    ofertas 
   TABLE DATA           M   COPY oferta.ofertas (offerse_id, name, description, price_value) FROM stdin;
    oferta          postgres    false    204   ?                  0    0    ofertas_offerse_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('oferta.ofertas_offerse_id_seq', 3, true);
          oferta          postgres    false    203            ?
           2606    93252    ofertas pk_oferta_ofertas 
   CONSTRAINT     _   ALTER TABLE ONLY oferta.ofertas
    ADD CONSTRAINT pk_oferta_ofertas PRIMARY KEY (offerse_id);
 C   ALTER TABLE ONLY oferta.ofertas DROP CONSTRAINT pk_oferta_ofertas;
       oferta            postgres    false    204               Q   x?3??K,J??J,?t?SH??)N?4500?2?H, ? ?Ҋ2K?8??F???yU?y@9(C?,?(%U!E? =?     