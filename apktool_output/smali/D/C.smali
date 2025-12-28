.class public final LD/C;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LD/D;LL/c;Ln/w;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LD/C;->e:I

    .line 1
    iput-object p1, p0, LD/C;->g:Ljava/lang/Object;

    iput-object p2, p0, LD/C;->h:Ljava/lang/Object;

    iput-object p3, p0, LD/C;->i:Ljava/lang/Object;

    iput p4, p0, LD/C;->f:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Ll0/o;Lt/t;I[I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LD/C;->e:I

    .line 2
    iput-object p1, p0, LD/C;->g:Ljava/lang/Object;

    iput-object p2, p0, LD/C;->h:Ljava/lang/Object;

    iput p3, p0, LD/C;->f:I

    iput-object p4, p0, LD/C;->i:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, LD/C;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/n;

    iget-object v0, p0, LD/C;->g:Ljava/lang/Object;

    check-cast v0, [Ll0/o;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ll0/o;->o()Ljava/lang/Object;

    iget-object v6, p0, LD/C;->h:Ljava/lang/Object;

    check-cast v6, Lt/t;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v7, v4, Ll0/o;->e:I

    iget v8, p0, LD/C;->f:I

    sub-int/2addr v8, v7

    iget-object v6, v6, Lt/t;->b:LP/c;

    int-to-float v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    const/4 v8, 0x1

    int-to-float v8, v8

    iget v6, v6, LP/c;->a:F

    add-float/2addr v8, v6

    mul-float/2addr v8, v7

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v6

    iget-object v7, p0, LD/C;->i:Ljava/lang/Object;

    check-cast v7, [I

    aget v3, v7, v3

    invoke-static {p1, v4, v3, v6}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    iget-object v0, p0, LD/C;->g:Ljava/lang/Object;

    check-cast v0, LD/D;

    if-eq p1, v0, :cond_4

    instance-of v0, p1, LN/y;

    if-eqz v0, :cond_3

    iget-object v0, p0, LD/C;->h:Ljava/lang/Object;

    check-cast v0, LL/c;

    iget v0, v0, LL/c;->a:I

    iget v1, p0, LD/C;->f:I

    sub-int/2addr v0, v1

    iget-object v1, p0, LD/C;->i:Ljava/lang/Object;

    check-cast v1, Ln/w;

    invoke-virtual {v1, p1}, Ln/w;->c(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object v3, v1, Ln/w;->c:[I

    aget v2, v3, v2

    goto :goto_1

    :cond_1
    const v2, 0x7fffffff

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, p1}, Ln/w;->b(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_2

    not-int v2, v2

    :cond_2
    iget-object v3, v1, Ln/w;->b:[Ljava/lang/Object;

    aput-object p1, v3, v2

    iget-object p1, v1, Ln/w;->c:[I

    aput v0, p1, v2

    :cond_3
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A derived state calculation cannot read itself"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
