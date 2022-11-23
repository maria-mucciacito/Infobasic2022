const redux = require('redux');
const createStore = redux.createStore;

//REDUCER
const reducer = (state,action) => {
    return state
}

//STORE
const store = createStore(reducer);
console.log(store.getState());