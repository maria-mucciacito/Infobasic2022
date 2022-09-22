
import psycopg2
class Manutenzione:

    def __init__(self, cod, data, orai, oraf, stato, des):
        self.codManutenzione = cod
        self.data = data
        self.oraInizio = orai
        self.oraFine = oraf
        self.stato = stato
        self.descrizione = des
        print("Creo classe" + self.__class__.name)

    @staticmethod
    def get_instance(id=0):
        print("Retrive ID  " + str(id) + "  Instance")
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('SELECT * FROM manutenzione WHERE id =' + str(id))
        dictA = cur.fetchall()
        for row in dictA:
            print(row)
        conn.commit()
        cur.close()
        conn.close()

    @staticmethod
    def create_instance( cod, data, orai, oraf, stato, des):
        conn = psycopg2.connect(
            host="tyke.db.elephantsql.com",
            database="uhqosvef",
            user="uhqosvef",
            password="N8mqqXPS_m2WElIIZ1eyIcf3qielKS97"
        )
        cur = conn.cursor()
        cur.execute('INSERT INTO manutenzione(cod_manutenzione,data,oraInizio,oraFine,stato,descrizione) VALUES (%s,%s,%s,%s,%s,%s)',( cod, data, orai, oraf, stato, des))
        conn.commit()
        cur.close()
        conn.close()

        m = Manutenzione()
        m.codManutenzione = cod
        m.data = data
        m.oraInizio = orai
        m.oraFine = oraf
        m.stato = stato
        m.descrizione = des


    def get_codManutenzione(self):
        return self.codManutenzione

    def set_data(self, data):
        self.data = data
    def get_data(self):
        return self.data

    def set_oraInizio(self, ora):
        self.telefono = ora
    def get_oraInizio(self):
        return self.oraInizio

    def set_oraFine(self, ora):
        self.telefono = ora
    def get_oraFine(self):
        return self.oraFine

    def set_stato(self, stato):
        self.stato = stato
    def get_stato(self):
        return self.stato

    def set_descrizione(self, des):
        self.descrizione = des
    def get_descrizione(self):
        return self.descrizione