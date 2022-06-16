import { Layout, Spin, Image } from 'antd';
import { LoadingOutlined } from '@ant-design/icons';
import 'antd/dist/antd.css';
import './index.css'
import UploadImage from './UploadImage';

const { Header, Footer, Content } = Layout;

const antIcon = (
    <LoadingOutlined
      style={{
        fontSize: 48,
      }}
      spin
    />
  );

export default () => (
    <Layout>
        <Header style={{ color: "white", fontSize: 32, fontWeight: "bold" }}>Конвертация в SVG</Header>
        <Content style={{ padding: '25px 50px 0 50px'}}>
            <div className="site-layout-content">
                <UploadImage />
            </div>
            <div className="loading">
                {/* <Spin indicator={antIcon}/> */}
                <Image
                    src="schemaTrigger.png"
                />
            </div>
        </Content>
        <Footer style={{ textAlign: 'center', bottom: '0' }}>© 2022, Vladead</Footer>
    </Layout>
)