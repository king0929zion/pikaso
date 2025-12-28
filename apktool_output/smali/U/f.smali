.class public final LU/f;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# static fields
.field public static final f:LU/f;

.field public static final g:LU/f;


# instance fields
.field public final synthetic e:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LU/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LU/f;-><init>(II)V

    sput-object v0, LU/f;->f:LU/f;

    new-instance v0, LU/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LU/f;-><init>(II)V

    sput-object v0, LU/f;->g:LU/f;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LU/f;->e:I

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LU/f;->e:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
