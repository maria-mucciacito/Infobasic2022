class Manutenzione:

    def __init__(self, cod, data, orai, oraf, stato, des):
        self.codManutenzione = cod
        self.data = data
        self.oraInizio = orai
        self.oraFine = oraf
        self.stato = stato
        self.descrizione = des

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