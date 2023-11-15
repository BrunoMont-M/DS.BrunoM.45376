import { Route, Routes } from "react-router-dom"
import { HomePage } from "../pages/HomePage"
import { Componentes } from "../pages/Componentes"
import { Administracion } from "../pages/Administracion"
import Pedidos from "../pages/Pedidos"
// import { Component } from "react"

export const AppRoutes: React.FC = () => {
    return (
        <>
            <Routes>
                <Route path="/" element={<HomePage/>}/>
                <Route path="/componentes" element={<Componentes/>}/>
                <Route path="/administracion" element={<Administracion/>}/>
                <Route path="/pedidos" element={<Pedidos/>}/>
                
            </Routes>
        </>
    )
}