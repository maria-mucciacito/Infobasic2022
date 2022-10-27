var express = require('express');
//const { response } = require('../app');
var router = express.Router();
var dbPool = require('../db');
var db = dbPool.getPool();

const getPrenotations = 
    (req,res)=>{
        db.query('SELECT * FROM prenotazione ORDER BY id ASC;', (error,results)=>{
            if(error){
                throw error
            } else {
                res.render('dashboard/prenotation', {data: results.rows})
            }
            //res.status(200).json(results.rows)
        })
    };

const insertPrenotationForm = 
    (req,res)=>{
        res.render('dashboard/insertPrenotation')
    }

const getPrenotationById = 
    (req,res)=>{
        var id = parseInt(req.params.id);
        db.query('SELECT * FROM prenotazione WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            } else {
                res.render('dashboard/udatePrenotation', {data: results.rows[0]});
            }
            //res.status(200).json(results.rows)
        })
    };

const createPrenotation = 
    (req,res)=>{
        const {data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento, codePrenotazione } = req.body
        db.query('INSERT INTO prenotazione (data, ora_partenza, punto_partenza, punto_arrivo, costo, distanza_km, utente, taxi, pagamento, code_prenotazione) VALUES ($1,$2,$3,$4,$5,$6,$7,$8,$9,$10) RETURNING id;', [data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento, codePrenotazione], (error,results)=>{
            if(error){
                console.log("Errore strategico");
                res.status(500).json({"message":error,"code":500,"result":results,"postdata":req.body});
            } else {
                //res.status(201).json({"result":results})
                //res.status(201).send("Prenotation added with ID: " + results.rows)
                res.redirect('/dashboard/prenotation')
            }
            
        })
    };

const updatePrenotation = 
    (req,res)=>{
        var id = parseInt(req.params.id)
        const {data, oraPartenza, puntoPartenza, puntoArrivo, costo, distanzaKm, utente, taxi, pagamento, codePrenotazione } = req.body
        db.query('UPDATE taxi SET data=$1, ora_partenza=$2, punto_partenza=$3, punto_arrivo=$4, costo=$5, distanza_km=$6, utente=$7, taxi=$8, pagamento=$9, code_prenotazione=$10 WHERE id=$11;',
        [data,oraPartenza,puntoPartenza,puntoArrivo,costo,distanzaKm,utente,taxi,pagamento,codePrenotazione],
        (error,results)=>{
            if(error){
                throw error
            } else {
                res.redirect('/dashboard/prenotation')
            }
            //res.status(200).send("Prenotation modified with ID: " + id)
        })


    };

const deletePrenotation= 
    (req,res)=>{
        var id = parseInt(req.params.id)
        db.query('DELETE FROM prenotazione WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            } else {
                res.redirect('/dashboard/prenotation')
            }
            //res.status(200).send("Prenotation deleted with ID: " + id)
        })
    };

module.exports = {getPrenotations,getPrenotationById,createPrenotation,updatePrenotation,deletePrenotation,insertPrenotationForm};