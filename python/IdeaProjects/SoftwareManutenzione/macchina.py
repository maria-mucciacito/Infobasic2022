import psycopg2

class Macchina:

    def __init__(self, cod, scopo, tipo):
        self.codMacchina = cod
        self.scopo = scopo
        self.tipo = tipo
        print("Creo classe" + self.__class__.name)

    @staticmethod
    def get_instance(id=0):
        print("Retrive ID"+str(id)+"Instance")
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('SELECT * FROM macchina WHERE id ='+ str(id))
        dictA = cur.fetchall()
        for row in dictA:
            print(row)
        conn.commit()
        cur.close()
        conn.close()


    @staticmethod
    def create_instance( cod, scopo, tipo):
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('INSERT INTO macchina(cod_macchina,scopo,tipo) VALUES (%s,%s,%s)',(cod,scopo,tipo))
        conn.commit()
        cur.close()
        conn.close()

        m = Macchina()
        m.codMacchina = cod
        m.scopo = scopo
        m.tipo = tipo

    def get_codMacchina(self):
        return self.codMacchina

    def set_scopo(self, scopo):
        self.scopo = scopo
    def get_scopo(self):
        return self.scopo

    def set_tipo(self, tipo):
        self.telefono = tipo
    def get_tipo(self):
        return self.tipo
