import Head from 'next/head'
import Script from 'next/script';

export default function Home() {
  return (
    <div>
      <Head>
        <title>Next + Vaadin</title>
      </Head>
      <Script
        src="http://localhost:8080/web-component/button-view-wc.js"
        strategy="lazyOnload"
        onLoad={() =>
          console.log(`web component script loaded correctly`)
        }
      />
      <main>
        Hello from Next.js
        <p>
          <button-view-wc></button-view-wc>
        </p>
      </main>
    </div>
  )
}
