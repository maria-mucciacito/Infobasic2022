class Macchina:

    def __init__(self, cod, scopo, tipo):
        self.codMacchina = cod
        self.scopo = scopo
        self.tipo = tipo

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
