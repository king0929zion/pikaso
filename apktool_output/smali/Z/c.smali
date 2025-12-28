.class public final LZ/c;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final f:LZ/c;

.field public static final g:LZ/c;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LZ/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LZ/c;-><init>(II)V

    sput-object v0, LZ/c;->f:LZ/c;

    new-instance v0, LZ/c;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LZ/c;-><init>(II)V

    sput-object v0, LZ/c;->g:LZ/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LZ/c;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LZ/c;->e:I

    packed-switch v0, :pswitch_data_0

    move-object v1, p1

    check-cast v1, LY/d;

    sget-wide v2, LW/r;->e:J

    const-wide/16 v4, 0x0

    const/16 v6, 0x7e

    invoke-static/range {v1 .. v6}, LY/d;->r(LY/d;JJI)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, LY/d;

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
