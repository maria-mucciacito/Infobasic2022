import psycopg2

class Reparto:

    def __init__(self, cod, nome, tipo, descrizione, capienza):
        self.codReparto = cod
        self.nome = nome
        self.tipo = tipo
        self.descrizione = descrizione
        self.capienza = capienza


    @staticmethod
    def get_instance(id=0):
        print("Retrive ID " + str(id) + " Instance")
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('SELECT * FROM reparto WHERE id =' + str(id))
        dictA = cur.fetchall()
        for row in dictA:
            print(row)
        conn.commit()
        cur.close()
        conn.close()

    @staticmethod
    def create_instance(cod, nome, tipo, descrizione, capienza):
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('INSERT INTO reparto(codreparto,nome,tipo,descrizione,capienza) VALUES (%s,%s,%s,%s,%s)', (cod, nome, tipo, descrizione, capienza))
        conn.commit()
        cur.close()
        conn.close()

        r = Reparto(cod, nome, tipo, descrizione, capienza)
     


    def get_codReparto(self):
        return self.codReparto

    def set_nome(self, nome):
        self.nome = nome
    def get_nome(self):
        return self.nome

    def set_tipo(self, tipo):
        self.tipo = tipo
    def get_tipo(self):
        return self.tipo

    def set_descrizione(self, des):
        self.descrizione = des
    def get_descrizione(self):
        return self.descrizione

    def set_capienza(self, capienza):
        self.capienza = capienza
    def get_capienza(self):
        return self.capienza
