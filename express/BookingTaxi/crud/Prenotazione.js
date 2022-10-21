var express = require('express');
//const { response } = require('../app');
var router = express.Router();
var dbPool = require('../routes/db');
var db = dbPool.getPool();

const getPrenotations = 
    router.get('/', (req,res)=>{
        db.query('SELECT * FROM prenotazione ORDER BY id ASC;', (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    });

const getPrenotationById = 
    router.get('/:id',(req,res)=>{
        var id = parseInt(req.params.id);
        db.query('SELECT * FROM prenotazione WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    });

const createPrenotation = 
    router.post('/', (req,res)=>{
        const {data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento } = req.body
        db.query('INSERT INTO prenotazione (data, ora_partenza, punto_partenza, punto_arrivo, costo, distanza_km, utente, taxi, pagamento) VALUES ($1,$2,$3,$4,$5,$6,$7,$8,$9) RETURNING id;', [data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento], (error,results)=>{
            if(error){
                console.log("Errore strategico");
                res.status(500).json({"message":error,"code":500,"result":results,"postdata":req.body});
            } else {
                //res.status(201).json({"result":results})
                res.status(201).send("Prenotation added with ID: " + results.rows)
            }
            
        })
    });

const updatePrenotation = 
    router.put('/:id', (req,res)=>{
        var id = parseInt(req.params.id)
        const {data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento } = req.body
        db.query('UPDATE taxi SET data=$1, ora_partenza=$2, punto_partenza=$3, punto_arrivo=$4, costo=$5, distanza_km=$6, utente=$7, taxi=$8, pagamento=$9 WHERE id=$10;',
        [data,oraPartenza,puntoPartenza,puntoArrivo,costo,distanzaKm,utente,taxi,pagamento],
        (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).send("Prenotation modified with ID: " + id)
        })


    });

const deletePrenotation= 
    router.delete('/:id', (req,res)=>{
        var id = parseInt(req.params.id)
        db.query('DELETE FROM prenotazione WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).send("Prenotation deleted with ID: " + id)
        })
    });

module.exports = {getPrenotations,getPrenotationById,createPrenotation,updatePrenotation,deletePrenotation};