import React from "react";

type BoxProps = {
  text: string;
};

const Box: React.FC<BoxProps> = ({ text }) => {
  return (
    <div className="box">
      <p className="box-text">{text}</p>
    </div>
  );
};

export default Box;
