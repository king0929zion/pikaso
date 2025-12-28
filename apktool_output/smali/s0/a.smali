.class public final Ls0/a;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final f:Ls0/a;

.field public static final g:Ls0/a;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ls0/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls0/a;-><init>(II)V

    sput-object v0, Ls0/a;->f:Ls0/a;

    new-instance v0, Ls0/a;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls0/a;-><init>(II)V

    sput-object v0, Ls0/a;->g:Ls0/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Ls0/a;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ls0/a;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, LA/a;->j(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    check-cast p1, Ls0/c;

    const/4 p1, 0x0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
