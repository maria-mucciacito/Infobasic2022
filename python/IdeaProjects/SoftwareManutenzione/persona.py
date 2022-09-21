import psycopg2
class Persona:

    def __init__(self, cf, nome, cognome, tel, email):
        self.codiceFiscale = cf
        self.nome = nome
        self.cognome = cognome
        self.email = email
        self.telefono = tel

    @staticmethod
    def create_instance(cf, nome, cognome, tel, email):
        conn = psycopg2.connect(
            host="localhost",
            database="",
            user="postgres",
            password="postgres"
        )
        cur = conn.cursor()
        cur.execute('INSERT INTO persona(codiceFiscale,nome,cognome,telefono,email')
        conn.commit()
        cur.close()
        conn.close()

        p = Persona()
        p.nome = nome
        p.cognome = cognome
        p.telefono = tel
        p.email = email

    def get_codiceFiscale(self):
        return self.codiceFiscale

    def set_nome(self, nome):
        self.nome = nome
    def get_nome(self):
        return self.nome

    def set_cognome(self, cognome):
        self.cognome = cognome
    def get_cognome(self):
        return self.cognome

    def set_email(self, email):
        self.email = email
    def get_email(self):
        return self.email

    def set_telefono(self, telefono):
        self.telefono = telefono
    def get_telefono(self):
        return self.telefono





































