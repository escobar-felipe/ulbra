import React from "react";

type BoxProps = {
  text: string;
};

const Box: React.FC<BoxProps> = ({ text }) => {
  return (
    <div>
      <p>{text}</p>
    </div>
  );
};

export default Box;
