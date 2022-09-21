class Reparto:

    def __init__(self, cod, nome, tipo, descrizione, capienza):
        self.codReparto = cod
        self.nome = nome
        self.tipo = tipo
        self.descrizione = descrizione
        self.capienza = capienza

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
