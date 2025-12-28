.class public final LU1/b;
.super LU0/b;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lr2/a;

.field public final synthetic f:LU1/d;


# direct methods
.method public constructor <init>(LU1/d;Lr2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/b;->f:LU1/d;

    iput-object p2, p0, LU1/b;->e:Lr2/a;

    return-void
.end method


# virtual methods
.method public final g(I)V
    .locals 2

    iget-object v0, p0, LU1/b;->f:LU1/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, LU1/d;->m:Z

    iget-object v0, p0, LU1/b;->e:Lr2/a;

    invoke-virtual {v0, p1}, Lr2/a;->Q(I)V

    return-void
.end method

.method public final h(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, LU1/b;->f:LU1/d;

    iget v1, v0, LU1/d;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, LU1/d;->n:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    iput-boolean p1, v0, LU1/d;->m:Z

    iget-object p1, v0, LU1/d;->n:Landroid/graphics/Typeface;

    const/4 v0, 0x0

    iget-object v1, p0, LU1/b;->e:Lr2/a;

    invoke-virtual {v1, p1, v0}, Lr2/a;->R(Landroid/graphics/Typeface;Z)V

    return-void
.end method
