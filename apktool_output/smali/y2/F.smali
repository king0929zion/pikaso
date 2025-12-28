.class public final Ly2/F;
.super Ly2/G;
.source "SourceFile"


# instance fields
.field public final f:Ly2/f;

.field public final synthetic g:Ly2/I;


# direct methods
.method public constructor <init>(Ly2/I;JLy2/f;)V
    .locals 0

    iput-object p1, p0, Ly2/F;->g:Ly2/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Ly2/G;->d:J

    const/4 p1, -0x1

    iput p1, p0, Ly2/G;->e:I

    iput-object p4, p0, Ly2/F;->f:Ly2/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly2/F;->f:Ly2/f;

    iget-object v1, p0, Ly2/F;->g:Ly2/I;

    invoke-virtual {v0, v1}, Ly2/f;->E(Ly2/r;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ly2/G;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly2/F;->f:Ly2/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
