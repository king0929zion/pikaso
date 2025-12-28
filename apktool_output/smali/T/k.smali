.class public final Lt/k;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:[Ll0/o;

.field public final synthetic f:Lt/l;

.field public final synthetic g:I

.field public final synthetic h:Ln0/L;

.field public final synthetic i:[I


# direct methods
.method public constructor <init>([Ll0/o;Lt/l;ILn0/L;[I)V
    .locals 0

    iput-object p1, p0, Lt/k;->e:[Ll0/o;

    iput-object p2, p0, Lt/k;->f:Lt/l;

    iput p3, p0, Lt/k;->g:I

    iput-object p4, p0, Lt/k;->h:Ln0/L;

    iput-object p5, p0, Lt/k;->i:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Ll0/n;

    iget-object v0, p0, Lt/k;->e:[Ll0/o;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ll0/o;->o()Ljava/lang/Object;

    iget-object v6, p0, Lt/k;->h:Ln0/L;

    invoke-virtual {v6}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v6

    iget-object v7, p0, Lt/k;->f:Lt/l;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v8, v4, Ll0/o;->d:I

    iget v9, p0, Lt/k;->g:I

    sub-int/2addr v9, v8

    iget-object v7, v7, Lt/l;->a:LP/b;

    int-to-float v8, v9

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sget-object v9, LG0/f;->d:LG0/f;

    iget v7, v7, LP/b;->a:F

    if-ne v6, v9, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, -0x1

    int-to-float v6, v6

    mul-float/2addr v7, v6

    :goto_1
    const/4 v6, 0x1

    int-to-float v6, v6

    add-float/2addr v6, v7

    mul-float/2addr v6, v8

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    iget-object v7, p0, Lt/k;->i:[I

    aget v3, v7, v3

    invoke-static {p1, v4, v6, v3}, Ll0/n;->d(Ll0/n;Ll0/o;II)V

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_1
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
