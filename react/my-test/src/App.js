//import Header from "./components/Header";
//import React,{useState,setState} from "react";
import {Routes,Route} from "react-router-dom";
import { Contact } from "./components/Contact";
import Header from "./components/Header";
import Login from "./components/Login";

/*export class Form extends React.Component{
  state = {
    value:''
  }
  handleSubmit = ()=>{
    this.props.submit(this.state.value)
  }
  onChangeText = (e)=>{
    //console.log(e.target.value);
    this.setState({
      value: e.target.value
    })
  }

  render() {
    return ( 
      <form onSubmit={this.handleSubmit}>
        <input type="text" value={this.state.value} onChange={this.onChangeText}></input>
      </form>
    )
  }
}*/


export const App= () => {
  return (
      <div>
          <Header />
          <Routes>
            <Route exact path="/login" element={<Login/>}></Route>
            <Route exact path="/contact" element={<Contact/>} />
          </Routes>
        
      </div>
      
  )
}


/*function App() {
  const name = "Brad";
  const x = true;
  const stampa  = () =>{
    console.log('stampa')
  }
  const [count,setCount] = useState(0)
  const increment = ()=>{
    setCount(count+1)
  }
  const [headers] = useState([
    {title: 'wow'},
    {title: 'ciao'},
  ])

  const addHeader = (header)=>{
    const {nwHeader} = [...headers, {title: header}]
    setState({
      headers: nwHeader
    })
  }
  return (
    <div className="App">

      <h1>hello from react {name}</h1>
      <h2>{x ? 'Yes' : 'No'}</h2>
      <Header  title="Hello" />
      <button onClick= {()=> console.log("Ho cliccato")} >cliccami</button>
      <button onClick={stampa}>stampa</button>
      <p>{count}</p>
      <button onClick={increment}>aumenta</button>
      {headers.map((header,index)=> (
        <Header key={index} title={header.title} />
      ))}
      <Form submit={addHeader} />
    </div>
  );
}

Header.defaultProps = {
  title: 'Hello task', 
}*/

/*import React, { Component } from 'react'

export default class App extends Component {
  render() {
    return (
      <div>App</div>
    )
  }
}*/


export default App;

/*
SPIEGAZIONE REACT
ClassName si usa al posto di class come propietrà nel tag html per indicare il nome della classe che magari potrebbe essere richiamato nel css per dare uno stile 
PROPS sono delle prpprietà che possiamo passare al componente per personalizzarlo 
Lo STATE serve a tenere conto dei cambiamenti che abbiamo nella nostra applicazione, prima era possibile solo utilizzando le classi con funzioni, adesso con gli HOOKS è possibile anche con le funzioni
Per installare il pacchetto che ci permette di fare un router: npm install react-router-dom 
SWITCH permette di mostrare sulla pagina un solo componente per volta 
EXACT permette di identificare il route / esattamente e non per esempio per altri route che contengono altre parole ma iniziano con lo stesso route della home
*/ 