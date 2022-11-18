using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Negozio.Models
{
    public class Prodotto
    {
        [Key]
        [Required]
        public int id;

        [Required]
        public string nome;

        [Required]
        public double prezzo;
        //private TipoProdotto tipoProdotto;

        [Required]
        public string codeProdotto;

        /*public Prodotto(int id, string nome, double prezzo, string codeProdotto)
        {
            this.id = id;
            this.nome = nome;
            this.prezzo = prezzo;
            //this.tipoProdotto = tipoProdotto;
            this.codeProdotto = codeProdotto;
        }

        public override string ToString()
        {
            return $"{base.ToString()}: {Nome} {CodeProdotto}";
        }*/

        public int Id
        {
            get { return id; }
        }

        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        }

        public double Prezzo
        {
            get { return prezzo; }
            set { prezzo = value; }
        }

        /*public TipoProdotto TipoProdotto{
            get{ return tipoProdotto;}
            set{ tipoProdotto=value;}
        }*/

        public string CodeProdotto
        {
            get { return codeProdotto; }
            set { codeProdotto = value; }
        }

    }
}
