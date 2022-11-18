using System;
using Microsoft.EntityFrameworkCore;
using Negozio.Models;

namespace Negozio.Data
{
    public class NegozioContext : DbContext
    {
        public virtual DbSet<Prodotto> Prodotto { get; set; } = null!;


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseNpgsql("User ID=olhdguej;Password=QAps0dGXP-wxx-k-hUixdmQlvsh_943v;Host=lucky.db.elephantsql.com;Port=5432;Database=olhdguej;");
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder){
            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);

        public NegozioContext()
        {
        }
    }
}

