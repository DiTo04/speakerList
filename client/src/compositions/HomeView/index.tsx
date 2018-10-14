import {SFC} from "react";
import * as React from "react";
import * as css from "./styles.css"

const HomeView : SFC = (props: {}) =>  {
        return (
            <div className={css.homeView}>
                <h1>Welcome to SpeakList!</h1>
                <p>Here you can create your own speakers list for every occasion!</p>
                <button>Create a Speakers list!</button>
                <h4>or join an excising one</h4>
                <form>
                    <input placeholder={"List key..."}/>
                    <button className={css.joinButton}>join!</button>
                </form>
                <svg className={css.wave} viewBox={"0 0 500 500"} preserveAspectRatio={"none"}>
                    <defs>
                        <linearGradient id={"Gradient1"} x1={"0"} x2={"1"} y1={"0"} y2={"1"}>
                            <stop offset="0%" stopColor="#1b2f52"/>
                            <stop offset="100%" stopColor="#467cd6"/>
                        </linearGradient>
                    </defs>
                    <path d={"M0,90 C150,30 350,170 500,90 L500,500 L0,500 Z"} style={{stroke: "none", fill:"url(#Gradient1)"}}/>
                </svg>
                <div className={css.background}/>
            </div>
        );
};

export default HomeView;