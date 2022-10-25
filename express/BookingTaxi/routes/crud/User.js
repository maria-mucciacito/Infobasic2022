var express = require('express');
//const { response } = require('../app');
var router = express.Router();
var dbPool = require('../db');
var db = dbPool.getPool();

const getUsers = 
    (req,res)=>{
        db.query('SELECT * FROM utente ORDER BY id ASC;', (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    };

const getUserById = 
    (req,res)=>{
        var id = parseInt(req.params.id);
        db.query('SELECT * FROM utente WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).json(results.rows)
        })
    };

const createUser = 
    (req,res)=>{
        const {codiceFiscale, nome, cognome, email, password,ruolo } = req.body
        db.query('INSERT INTO taxi (codice_fiscale,nome,cognome,email,password,ruolo) VALUES ($1,$2,$3,$4,$5,$6) RETURNING id;', [codiceFiscale,nome,cognome,email,password,ruolo], (error,results)=>{
            if(error){
                console.log("Errore strategico");
                res.status(500).json({"message":error,"code":500,"result":results,"postdata":req.body});
            } else {
                //res.status(201).json({"result":results})
                res.status(201).send("User added with ID: " + results.rows)
            }
            
        })
    };

const updateUser= 
    (req,res)=>{
        var id = parseInt(req.params.id)
        const {codiceFiscale, nome, cognome, email, password,ruolo } = req.body
        db.query('UPDATE utente SET codice_fiscale=$1, nome=$2, cognome=$3, email=$4, password=$5 ruolo=$6 WHERE id=$7;',
        [codiceFiscale,nome,cognome,email,password,ruolo],
        (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).send("User modified with ID: " + id)
        })


    };

const deleteUser= 
    (req,res)=>{
        var id = parseInt(req.params.id)
        db.query('DELETE FROM utente WHERE id=$1;',[id], (error,results)=>{
            if(error){
                throw error
            }
            res.status(200).send("User deleted with ID: " + id)
        })
    };

module.exports = {getUsers,getUserById,createUser,updateUser,deleteUser};