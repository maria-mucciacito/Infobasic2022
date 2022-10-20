var express = require('express');
//const { response } = require('../app');
var router = express.Router();
var dbPool = require('../routes/db');
var db = dbPool.getPool();

const getTaxis = 
    router.get('/', (req,res)=>{
        db.query('SELECT * FROM taxi ORDER BY id ASC;', (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    });

const getTaxiById = 
    router.get('/:id',(req,res)=>{
        var id = parseInt(req.params.id);
        db.query('SELECT * FROM taxi WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    });

const createTaxi = 
    router.post('/', (req,res)=>{
        const {targa, modello, descrizione, nome } = req.body
        db.query('INSERT INTO taxi (targa,modello,descrizione,nome) VALUES ($1,$2,$3,$4) RETURNING id;', [targa,modello,descrizione,nome], (error,results)=>{
            if(error){
                console.log("Errore strategico");
                res.status(500).json({"message":error,"code":500,"result":results,"postdata":req.body});
            } else {
                //res.status(201).json({"result":results})
                res.status(201).send("Taxi added with ID: " + results.rows)
            }
            
        })
    });

const updateTaxi = 
    router.put('/:id', (req,res)=>{
        var id = parseInt(req.params.id)
        console.log(id)
        const {targa, modello, descrizione, nome } = req.body
        db.query('UPDATE taxi SET targa=$1, modello=$2, descrizione=$3, nome=$4 WHERE id=$5;',
        [targa,modello,descrizione,nome,id],
        (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).send("Taxi modified with ID: " + id)
        })


    });

//const deleteTaxi;

module.exports = {getTaxis,getTaxiById,createTaxi,updateTaxi};