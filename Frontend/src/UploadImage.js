import {
    Upload,
    message
} from "antd";
import {
    InboxOutlined
} from "@ant-design/icons";
import React from "react";

const { Dragger } = Upload;

const props = {
    name: 'file',
    multiple: false,
    onChange(info) {
        const { status } = info.file;
        if (status !== 'uploading') {
            console.log(info.file, info.fileList);
        }
        if (status === 'done') {
            message.success(`${info.file.name} файл загружен успешно.`);
        } else if (status === 'error') {
            message.error(`${info.file.name} не удалось загрузить`)
        }
    },
    onDrop(e) {
        console.log('Dropped files', e.dataTransfer.files);
    },
};

function getBase64(image, callback) {
    const reader = new FileReader();
    reader.addEventListener('load', () => callback(reader.result));
    reader.readAsDataURL(image);
}

function beforeUpload(file) {
    const isFormatValid = file.type === 'image/jpeg' || file.type === 'image/jpg' || file.type === 'image/png' ||
        file.type === 'image/gif';
    if (!isFormatValid) {
        message.error('Формат не подходит!');
    }
    return isFormatValid;
}

// export default () => (
//     <Dragger {...props}>
//         <p className="ant-upload-drag-icon">
//             <InboxOutlined />
//         </p>
//         <p className="ant-upload-text">Нажмите или перетащите сюда файл для загрузки</p>
//         <p className="ant-upload-hint">
//             За раз можно конвертировать только один файл
//         </p>
//     </Dragger>
// )

class UploadImage extends React.Component {
    state = {
        loading: false,
    };

    handleChange = info => {
        if (info.file.status === 'uploading') {
            this.setState({ loading: true });
            return;
        }
        if (info.file.status === 'done') {
            // Get this url from response in real world.
            getBase64(info.file.originFileObj, imageUrl =>
                this.setState({
                    imageUrl,
                    loading: false,
                }),
            );
        }
    };

    render() {
        return (
            <Dragger {...props}>
                <p className="ant-upload-drag-icon">
                    <InboxOutlined />
                </p>
                <p className="ant-upload-text">Нажмите или перетащите сюда файл для загрузки</p>
                <p className="ant-upload-hint">
                    За раз можно конвертировать только один файл
                </p>
            </Dragger>
        );
    }
}

export default UploadImage;
