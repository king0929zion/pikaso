.class public final LG1/b;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# static fields
.field public static final e:LG1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LG1/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, LG1/b;->e:LG1/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p1

    check-cast v0, Lt/u;

    move-object/from16 v22, p2

    check-cast v22, LD/n;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "$this$Button"

    invoke-static {v0, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, v1, 0x51

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    invoke-virtual/range {v22 .. v22}, LD/n;->y()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {v22 .. v22}, LD/n;->K()V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v24, 0x0

    const v25, 0x1fffe

    const-string v1, "\u6253\u5f00\u65e0\u969c\u788d\u8bbe\u7f6e"

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x6

    invoke-static/range {v1 .. v25}, LA/O;->b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V

    :goto_1
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0
.end method
