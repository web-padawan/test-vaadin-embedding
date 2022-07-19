
import dynamic from "next/dynamic";
import React from "react";

function MyApp({ Component, pageProps }) {
  return <Component {...pageProps} />
}

export default dynamic(() => Promise.resolve(MyApp), {
  ssr: false,
});
